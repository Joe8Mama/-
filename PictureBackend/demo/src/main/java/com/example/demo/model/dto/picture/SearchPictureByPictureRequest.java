package com.example.demo.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

/**
 * 以图搜图搜索请求
 */
@Data
public class SearchPictureByPictureRequest implements Serializable {

    /**
     * 图片 id
     */
    private Long pictureId;

    private static final long serialVersionUID = 1L;
}
