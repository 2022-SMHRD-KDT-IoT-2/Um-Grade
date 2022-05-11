package kr.smhrd.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Select;

import kr.smhrd.domain.Rfid;


public interface RfidFrontMapper {
	@Select("select * from t_frfid")
	public List<Rfid> selectRfid();
	
	public void insertLog(String rfid_uid);
	
	public String selectCheck();
	
	public boolean selectSame();
	
	public int selectDiff();
	
}
