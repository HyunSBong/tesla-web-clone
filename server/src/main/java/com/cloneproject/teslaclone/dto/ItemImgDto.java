package com.cloneproject.teslaclone.dto;

import com.cloneproject.teslaclone.entity.ItemImgEntity;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter @Setter
// 상품을 저장하면 상품 이미지 정보를 전달할 DTO
public class ItemImgDto {

    private Long id;

    private String imgName;

    private String originalImgName;

    private String imgUrl;

    private String mainImgYn;

    private static ModelMapper modelMapper = new ModelMapper();

    public static ItemImgDto of(ItemImgEntity itemImgEntity) {
        return modelMapper.map(itemImgEntity,ItemImgDto.class);
    }

}
