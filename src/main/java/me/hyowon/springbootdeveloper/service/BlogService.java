package me.hyowon.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import me.hyowon.springbootdeveloper.domain.Article;
import me.hyowon.springbootdeveloper.dto.AddArticleRequest;
import me.hyowon.springbootdeveloper.repository.BlogRepository;

@RequiredArgsConstructor // final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service // 빈으로 등록
public class BlogService {

    private final BlogRepository blogRepository; // final이 붙은 필드는 생성자에서 초기화해야 함

    // 블로그 글 추가 메서드
    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
