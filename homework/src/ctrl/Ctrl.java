package ctrl;

import java.util.ArrayList;

import View.AdminView;
import View.ClientView;
import model.ProductDAO;
import model.ProductVO;

public class Ctrl {
	private ProductDAO pDAO; // 상품 DAO
	private AdminView admin; // 관리자 View
	private ClientView client; // 사용자 View

	public Ctrl() {
		pDAO = new ProductDAO();
		admin = new AdminView();
		client = new ClientView();
	}

	public void startApp() {
		while(true) { 
			System.out.println(" 로그 : 사용자가 새로 입장합니다. ");
			ArrayList<ProductVO> cart = new ArrayList<ProductVO>(); // 장바구니 리스트배열 선언
			while(true) {
				int action = client.printClientMenu02(6); // 사용자메뉴출력
				if(action == 777) { // 관리자 모드 실행
					while(true) { // 관리자 모드 진입
						action = admin.printAdminMenu(5); // 관리자 모드 메뉴
						if(action == 1) { // 상품 추가
							String name = admin.getProductName(); // 사용자에게 상품 이름 뭐할지 물어봄
							int price = admin.getProductPrice();  // 사용자에게 가격 뭐로 할지 물어봄
							int cnt = admin.getProductCnt(); // 사용자에게 재고 개수 몇개로 할지 물어봄
							if(admin.printCheckAddProduct()) { // 위에서 반환된 값이 true라면
								ProductVO vo = new ProductVO(0, name, price, cnt); // M에게 insert()하기 위해 전달
								if(pDAO.insert(vo)) { // insert()를 성공했다면
									admin.printAddProductTrue(); // '성공' 출력
								}
							}
							admin.printAddProductFalse(); // 실패했다면 '실패' 출력
						}
						else if(action == 2) { // 상품 삭제
							int num = admin.getDeletePKNum(); // 사용자에게 삭제할 상품의 번호 물어봄 
							if(admin.printCheckDelete()) { // printCheckDelete()가 true 라면,
								ProductVO vo = new ProductVO(num, null, 0, 0); // M에게 delete()하기 위해 전달
								if(pDAO.delete(vo)) { // delete()를 성공했다면
									admin.printDeleteTrue(); // '성공' 출력
								}
							}
							admin.printDeleteFalse(); // '실패' 출력
						}
						else if(action == 3) { // 재고 변경
							int pk = admin.getChangePKNum(); // 사용자에게 변경할 재고의 상품 번호 물어봄
							int cnt = admin.getChangeCnt(); // 사용자에게 변경할 재고의 개수 물어봄
							if(admin.printCheckChange()) { // 사용자에게 요청한 printCheckChange() 가 true 라면
								ProductVO vo = new ProductVO(pk, null, 0, cnt); // M에게 update()하기 위해 전달
								if(pDAO.update(vo)) { // update()를 성공했다면
									admin.printChangeTrue(); // '성공' 출력
								}
								else { // 실패했다면
									admin.printChangeFalse(); // '실패' 출력
								}
							}
						}
						else if(action == 4) { // 관리자 모드 종료
							admin.printAdminEnd(); // 관리자모드 종료 멘트 출력
							break; // 관리자모드 즉시 종료
						}
					}
				}
				else if(action == 1) { // 상품 목록 출력
					ArrayList<ProductVO> pdatas = pDAO.selectAll(null); // M에게 selectAll() 요청
					client.printProductList(pdatas); // V에게 상품 목록 출력해달라고 요청
					
				}
				else if(action == 2) { // 상품 구매
					int num = client.getBuyPKNum(); // 사용자에게 어떤 상품 살건지 물어봄
					int cnt = client.getButCntNum(); // 사용자에게 몇개 살건지 물어봄
					ProductVO vo = new ProductVO(num, null, 0, -cnt); // M에게 update()하기 위해 전달

					if(pDAO.update(vo)) { // update() 성공했다면
						ProductVO pdata = pDAO.selectOne(vo); // M에게 selectOne() 요청
						cart.add(pdata); // 카드에 구매한 상품 추가
						client.printBuyTrue(); // '구매 성공' 출력
					} else if(vo.getCnt() - cnt < 0) { // 사용자가 입력한 값이 현재 재고량보다 많을 경우
						client.printBuyFalseCntOver(); // 살수 없다고 출력
					} else if(vo.getCnt() == 0){  // 재고가 없을 경우
						client.printBuyFalseCntZero(); // '재고가 없습니다' 출력
					}
				}
				else if(action == 3) { // 상품 목록 검색_이름으로 검색
					String name = client.getSearchContent(); // 사용자에게 검색할 이름 물어봄
					ProductVO pVO = new ProductVO(0, name, 0, 0); // C가
					ArrayList<ProductVO> pdatas = pDAO.selectAll(pVO);  // M에게 입력 받은 이름 전달해줌 
					client.printProductList(pdatas); // V가 불러온 상품들 출력
				}
				else if(action == 4) { // 상품목록검색_가격으로 검색
					String name = client.printClientSearchPriceMenu(5);
					if(name.equals("1") || name.equals("2")) { // 상품 검색_최저가 검색 , 상품 검색_최고가 검색
						ProductVO pVO = new ProductVO(0, name, 0, 0); // 최저가를 M한테 보내줌
						ProductVO data = pDAO.selectOne(pVO); // M이 최저가 상품을 가져옴
						client.printProduct(data); // V가 최저가 상품을 출력해줌
					}
					else if(name.equals("3") || name.equals("4")) { // 입력값보다 비싼 상품들 검색, 입력값보다 싼 상품들 출력
						int price = client.getSearchPrice();
						ProductVO pVO = new ProductVO(0, name, price, 0); // 사용자에게 가격 입력 받음 
						ArrayList<ProductVO> pdatas = pDAO.selectAll(pVO); // 입력 받은 값을 M한테 전달해줌
						client.printProductList(pdatas); // V가 출력해줌
					}
					else if(name.equals("5")) { // 필터 검색(가격 2번 입력)
						ProductVO pVO = client.getSearchFilter(); // 사용자에게 가격 두번 입력 받음 (최저가 ~ 최고가) 
						ArrayList<ProductVO> pdatas = pDAO.selectAll(pVO); // 입력받은 값을 M에게 전달
						client.printProductList(pdatas); // V가 출력해줌
					}
				}
				else if(action == 5) { // 사용자모드 종료
					client.printProductList(cart); // 사용자가 구매한 상품들 출력
					System.out.println("\n 로그 : 사용자가 퇴장하였습니다.\n");
					break;
				}
			}
		}
	}

}
