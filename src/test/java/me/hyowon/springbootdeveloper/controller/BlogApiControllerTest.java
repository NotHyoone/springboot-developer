package me.hyowon.springbootdeveloper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import me.hyowon.springbootdeveloper.repository.BlogRepository;

@SpringBootTest // 테스트용 애플리케이션 컨텍스트
@AutoConfigureMockMvc // MockMvc를 자동으로 설정
public class BlogApiControllerTest {

    @Autowired
    private MockMvc mockMvc; // MockMvc 객체를 주입받음

    @Autowired
    protected ObjectMapper objectMapper; // JSON 직렬화/역직렬화에 사용

    @Autowired
    protected WebApplicationContet context;

    @Autowired
    BlogRepository blogRepository; // 테스트용 BlogRepository 객체를 주입받음

    @BeforeEach // 테스트 실행 전 실행하는 메서드
    public void mockMvcSetUp() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(context)
                .builde();
        blogRepository.deleteAll();
    }
}
