package kr.smhrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.smhrd.domain.Rfid;

public interface RfidBackMapper {
	@Select("select * from t_brfid")
	public List<Rfid> selectRfid();
	
	public void insertLog(Rfid vo);
	
	public String selectCheck();
	
	public boolean selectSame();
	
	public int selectDiff();
	
}
