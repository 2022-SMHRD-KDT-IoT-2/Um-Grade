package com.example.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.dto.UmbrellaVO;

@Repository
public class UmbrellaDAOImpl implements UmbrellaDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace = "com.example.mapper.umbrellaMapper";
	
	@Override
	public List<UmbrellaVO> selectUmb() throws Exception {

		return sqlSession.selectList(Namespace+".selectUmbrella");
	}

	@Override
	public int insertUmb(UmbrellaVO vo) throws Exception {
		return sqlSession.insert(Namespace+".insertUmb");
	}

	@Override
	public UmbrellaVO selectOneUmb(int umb_seq) throws Exception {
		return sqlSession.selectOne(Namespace+".selectOneUmb");
	}

	@Override
	public int deleteUmb(int umb_seq) throws Exception {
		return sqlSession.delete(Namespace+".deleteUmb");
	}

	@Override
	public int updateUmbRfid(UmbrellaVO vo) throws Exception {
		return sqlSession.update(Namespace+".updateUmbRfid");
	}

	@Override
	public int updateUmbCheck(UmbrellaVO vo) throws Exception {
		return sqlSession.update(Namespace+".updateUmbCheck");
	}

	@Override
	public int updateUmbBroken(UmbrellaVO vo) throws Exception {
		return sqlSession.update(Namespace+".updateUmbBroken");
	}


}
