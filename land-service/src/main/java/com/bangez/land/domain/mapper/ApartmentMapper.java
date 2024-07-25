package com.bangez.land.domain.mapper;
import org.springframework.stereotype.Component;

import com.bangez.land.domain.model.ApartmentModel;
import com.bangez.land.domain.dto.ApartmentDto;
@Component
public class ApartmentMapper {
    public ApartmentModel toModel(ApartmentDto dto) {
        return ApartmentModel.builder()
                .id(dto.getId())
                .atclNo(dto.getAtclNo())
                .atclNm(dto.getAtclNm())
                .rletTpNm(dto.getRletTpNm())
                .tradTpNm(dto.getTradTpNm())
                .flrInfo(dto.getFlrInfo())
                .prc(dto.getPrc())
                .rentPrc(dto.getRentPrc())
                .hanPrc(dto.getHanPrc())
                .spc1(dto.getSpc1())
                .spc2(dto.getSpc2())
                .direction(dto.getDirection())
                .atclCfmYmd(dto.getAtclCfmYmd())
                .lat(dto.getLat())
                .lng(dto.getLng())
                .atclFetrDesc(dto.getAtclFetrDesc())
                .tagList(dto.getTagList())
                .bildNm(dto.getBildNm())
                .town(dto.getTown())
                .roadAddress(dto.getRoadAddress())
                .address(dto.getAddress())
                .build();
    }
    public ApartmentDto toDTO(ApartmentModel model) {
        return ApartmentDto.builder()
                .id(model.getId())
                .atclNo(model.getAtclNo())
                .atclNm(model.getAtclNm())
                .rletTpNm(model.getRletTpNm())
                .tradTpNm(model.getTradTpNm())
                .flrInfo(model.getFlrInfo())
                .prc(model.getPrc())
                .rentPrc(model.getRentPrc())
                .hanPrc(model.getHanPrc())
                .spc1(model.getSpc1())
                .spc2(model.getSpc2())
                .direction(model.getDirection())
                .atclCfmYmd(model.getAtclCfmYmd())
                .lat(model.getLat())
                .lng(model.getLng())
                .atclFetrDesc(model.getAtclFetrDesc())
                .tagList(model.getTagList())
                .bildNm(model.getBildNm())
                .town(model.getTown())
                .roadAddress(model.getRoadAddress())
                .address(model.getAddress())
                .build();
    }
}
