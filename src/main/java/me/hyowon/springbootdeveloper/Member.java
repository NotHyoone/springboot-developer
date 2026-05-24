package me.hyowon.springbootdeveloper;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본 생성자 생성, 접근 제어자 protected
@AllArgsConstructor // 모든 필드를 매개변수로 받는 생성자 생성
@Getter
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID 자동 생성 전략
    @Column(name = "id", updatable = false)
    private Long id; // DB 테이블의 'id' 컬럼과 매칭

    @Column(name = "name", nullable = false)
    private String name; // DB 테이블의 'name' 컬럼과 매칭
}
