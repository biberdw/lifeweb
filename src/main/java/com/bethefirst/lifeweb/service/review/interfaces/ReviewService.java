package com.bethefirst.lifeweb.service.review.interfaces;

import com.bethefirst.lifeweb.dto.review.reqeust.ReviewCreateDto;

public interface ReviewService {

    /** 리뷰 등록 */
    void createReview(ReviewCreateDto reviewCreateDto, Long memberId);

    /** 리뷰 삭제 */
    void deleteReview(Long reviewId);
}
