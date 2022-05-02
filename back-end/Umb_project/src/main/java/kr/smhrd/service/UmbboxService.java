package kr.smhrd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.smhrd.domain.Umbbox;
import kr.smhrd.mapper.UmbboxMapper;

@Service
public class UmbboxService {

	@Autowired
	private UmbboxMapper mapper;
	
	public List<Umbbox> selectUbox() {
		List<Umbbox> list = mapper.selectUbox();
		return list;
	}
}
