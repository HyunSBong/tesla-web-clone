package com.cloneproject.teslaclone.dto;

import com.cloneproject.teslaclone.constant.ItemSellStatus;
import com.cloneproject.teslaclone.entity.Item;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
// 상품 정보를 전달하는 DTO
public class ItemFormDto {

    private Long id;

    @NotBlank(message = "상품명을 입력해주세요.")
    private String itemNm;

    @NotNull(message = "가격을 입력해주세요.")
    private Integer price;

    @NotBlank(message = "상품 상세 정보를 입력해주세요.")
    private String itemDetail;

    @NotNull(message = "재고를 입력해주세요.")
    private Integer stockNumber;

    private ItemSellStatus itemSellStatus;

    // 상품 수정 시 이미지 정보 리스트
    private List<ItemImgDto> itemImgDtoList = new ArrayList<>();

    // 상품 이미지 아이디 정보 리스트
    private List<Long> itemImgIds = new ArrayList<>();

    private static ModelMapper modelMapper = new ModelMapper();

    public Item createItem(){
        return modelMapper.map(this, Item.class);
    }

    public static ItemFormDto of(Item item){
        return modelMapper.map(item,ItemFormDto.class);
    }

}
