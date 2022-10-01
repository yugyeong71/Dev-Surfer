package com.example.devsurfer.ticket;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class TicketForm {

    private String content; // 내용

    private LocalDateTime create_dt; // 생성일

    private LocalDateTime update_dt; // 수정일

    private Long repositoryId;

    private Boolean is_public; // 공개여부

    private String branch; // 브랜치 명

    private String[] image; // s3에 저장된 이미지 경로

    private String[] sketch_board_image; // s3에 저장된 스케치보드 이미지 경로

    private String[] sketch_board_json; // 스케치보드 데이터 Json을 String으로 변환한 데이터

    private String[] reference_link; // 참고 링크

    private Long parent_ticket_id; // 상위로 둘 ticket 아이디

}
