package com.bethefirst.lifeweb.dto.member.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateMemberSnsDto {

    private Long memberId; //회원 PK
    private Long snsId; //SNS PK
    private String url;//SNS URL



}
