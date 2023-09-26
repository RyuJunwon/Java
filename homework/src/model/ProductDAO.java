package model;

import java.util.ArrayList;
import java.util.Collections;

// 목록출력,목록검색_이름,목록검색_가격순,목록검색_조회수
public class ProductDAO {
	private ArrayList<ProductVO> datas;
	private static int PK=1001;
	public ProductDAO() {
		datas=new ArrayList<ProductVO>();
		datas.add(new ProductVO(PK++,"장갑",12000,2));
		datas.add(new ProductVO(PK++,"화장지",1000,1));
		datas.add(new ProductVO(PK++,"장화",23000,0));
		datas.add(new ProductVO(PK++,"지갑",120000,1));
		datas.add(new ProductVO(PK++,"화분",5500,2));
	}

	public ArrayList<ProductVO> selectAll(ProductVO pVO){
		// 높은 응집도를 위해
		// 여러기능을 하나의 메서드에서 작성
		if(pVO == null) {
			return datas;
		}
		else if(pVO.getName().equals("5")) {
			//			반환해줄 배열 만들고
			ArrayList<ProductVO> mdatas=new ArrayList<ProductVO>();
			//			가격범위에 들어가는 데이터들을 추가해서
			for(ProductVO data:datas) {
				if(pVO.getPrice() <= data.getPrice() && data.getPrice()<=pVO.getCnt()) {
					mdatas.add(data);
				}
			}
			// 반환해~
			return mdatas;
		}
		else if(pVO.getName().equals("3")) {
			ArrayList<ProductVO> mdatas = new ArrayList<ProductVO>();
			for(ProductVO data:datas) {
				if(pVO.getPrice() < data.getPrice()) {
					mdatas.add(data);
				}
			}
			return mdatas;
		}
		else if(pVO.getName().equals("4")) {
			ArrayList<ProductVO> mdatas = new ArrayList<ProductVO>();
			for(ProductVO data:datas) {
				if(pVO.getPrice() > data.getPrice()) {
					mdatas.add(data);
				}
			}
			return mdatas;
		}

		else if(pVO!=null) {
			// 상품목록출력을 할때에는 인자(pVO)가 null 이므로
			// pVO가 null이 아니라면 '이름으로검색'임!
			ArrayList<ProductVO> mdatas=new ArrayList<ProductVO>();
			for(ProductVO data:datas) {
				if(data.getName().contains(pVO.getName())) {
					//pVO.getName() == 사용자가 검색한 단어
					mdatas.add(data);
					//				사용자가 입력한 이름을 가진 데이터를
					//				mdatas에 저장해서
				}
			}
			return mdatas;
		}
		return datas;
	}
	public ProductVO selectOne(ProductVO pVO){

		if(pVO.getName() == null) {
			for(int i=0;i<datas.size();i++) {
				if(pVO.getPK() == datas.get(i).getPK()) {
					ProductVO pdata = new ProductVO(datas.get(i).getPK(), datas.get(i).getName(), datas.get(i).getPrice(), (-1) * pVO.getCnt());
					return pdata;
				} 
			}
		}
		else if(pVO.getName().equals("2")) {
			int max=datas.get(0).getPrice();
			int maxIndex=0;
			for(int i=0;i<datas.size();i++) {
				if(max<datas.get(i).getPrice()) {
					max=datas.get(i).getPrice();
					maxIndex=i;
				}
			}
			return datas.get(maxIndex);
			//			최고가를 찾는 알고리즘 활용
			//			return 최고가상품;
		}
		else if(pVO.getName().equals("1")) {
			int min=datas.get(0).getPrice();		
			int minIndex=0;
			for(int i=1;i<datas.size();i++) {
				if(min>datas.get(i).getPrice()) {
					min=datas.get(i).getPrice();
					minIndex=i;
				}
			}
			return datas.get(minIndex); 
		} 
		return null;
	}

	public boolean insert(ProductVO pVO) { // 상품 추가
		System.out.println("MODEL(DAO) : pvo : "+pVO);
		datas.add(new ProductVO(PK++, pVO.getName(),pVO.getPrice(),pVO.getCnt()));
		return true;
	}
	public boolean update(ProductVO pVO) {// 상품 구매 및 재고 변경
		for(ProductVO data:datas) {
			if(data.getPK()==pVO.getPK()) {
				// 구매할때에는 절대값이랑 내 재고랑 비교
				if(pVO.getCnt()<0) { // 구매할때
					int cnt=pVO.getCnt()*(-1); // 구매하려는 양 <- 이곳을 사용자의 입력값을 받아야 한다!
					if(cnt>data.getCnt()) {
						System.out.println(" 로그: update(): 재고없음");
						return false;
					}
				}
				data.setCnt(data.getCnt()+pVO.getCnt());
				System.out.println("data: "+data);
				return true;      
			}
		}
		System.out.println(" 로그: update(): 해당상품없음");
		return false;



	}
	public boolean delete(ProductVO pVO) {
		for(int i=0;i<datas.size();i++) {
			if(datas.get(i).getPK()==pVO.getPK()) {
				datas.remove(i);
				return true;
			}
		}
		System.out.println(" 로그: delete(): 해당상품없음");
		return false;
	}
}
