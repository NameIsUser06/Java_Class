package com.web.community.domain;

import com.web.community.repository.BoardRepository;
import com.web.community.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDateTime;

@DataJpaTest
class UserTest {
    private final String boardTestTitle = "테스트";
    private final String email = "test@gmail.com";

    @Autowired
    UserRepository userRepository;

    @Autowired
    BoardRepository boardRepository;

    @BeforeEach
    public void setUp() {
        User user = userRepository.save(User.builder()
                .name("cho")
                .password("123")
                .email(email)
                .created_date(LocalDateTime.now())
                .updated_date(LocalDateTime.now())
                .build());

        Board board = boardRepository.save(Board.builder()
                .title(boardTestTitle)
                .subtitle("서브타이틀")
                .boardType(BoardType.FREE)
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .user(user).build());

    }

    @Test
    public void testUser() {
        User user = userRepository.findByEmail(email);
        Assertions.assertEquals(user.getEmail(), email);
        Assertions.assertEquals(user.getName(), "cho");

        Board board = boardRepository.findByUser(user);
        Assertions.assertEquals(board.getTitle(), boardTestTitle);
        Assertions.assertEquals(board.getUser(), user);

    }


}