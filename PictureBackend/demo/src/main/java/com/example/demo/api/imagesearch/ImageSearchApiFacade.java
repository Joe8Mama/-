package com.example.demo.api.imagesearch;

import com.example.demo.api.imagesearch.model.ImageSearchResult;
import com.example.demo.api.imagesearch.sub.GetImageFirstUrlApi;
import com.example.demo.api.imagesearch.sub.GetImageListApi;
import com.example.demo.api.imagesearch.sub.GetImagePageUrlApi;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class ImageSearchApiFacade {

    /**
     * 搜索图片
     *
     * @param imageUrl 图片链接
     * @return 图片搜索结果
     */
    public static List<ImageSearchResult> searchImage(String imageUrl) {
        String imagePageUrl = GetImagePageUrlApi.getImagePageUrl(imageUrl);
        String imageFirstUrl = GetImageFirstUrlApi.getImageFirstUrl(imagePageUrl);
        List<ImageSearchResult> imageList = GetImageListApi.getImageList(imageFirstUrl);
        return imageList;
    }

}
