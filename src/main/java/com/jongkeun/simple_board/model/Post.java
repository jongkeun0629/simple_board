package com.jongkeun.simple_board.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "posts")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 200)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "author_id")
    private User author;

    // 유저 - 게시물과 달리(유저의 게시물 확인 기능 미구현) 게시물 - 댓글은 게시물 입장에서 댓글 확인 해아함. 반대로도 연결
    // cascade 포스트 삭제 시 댓글 같이 삭제. orphanRemoval 부모 자식 관계 끊기면 삭제
    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    @OrderBy("createAt ASC")
    private List<Comment> comments;
}
