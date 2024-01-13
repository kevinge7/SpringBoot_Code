package com.chuwa.hw.service;

import com.chuwa.hw.payload.PostDto;
import com.chuwa.hw.payload.PostResponse;

import java.util.List;

public interface PostSerivice {

    PostDto createPost(PostDto postDto);
    List<PostDto> getAllPost();
    PostResponse getAllPost(int pageNo, int pageSize, String sortBy, String sortDir);
    PostDto getPostbyId(long id);
    PostDto updatePost(PostDto postDto, long id);
    void deletePostById(long id);
}
