package com.cloneproject.teslaclone.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "item_img")
public class ItemImgEntity extends AllTimeInfoEntity {
    @Id
    @Column(name = "item_img_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String imgName; // 이미지 파일명

    private String originalImgName; // 원본 이미지 파일명

    private String imgUrl; // 이미지 경로

    private String mainImgYn; // 상품의 대표 이미지 여부

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    // 이미지 정보 업데이트
    public void updateItemImg(String originalImgName, String imgName, String imgUrl){
        this.originalImgName = originalImgName;
        this.imgName = imgName;
        this.imgUrl = imgUrl;
    }
}
