package org.zerock.b01.domain;


import lombok.*;

import javax.persistence.*;


/**
 * 엔티티 객체를 위한 엔티티 클래스는 반드시 @Entity를 적용해야하고 @Id가 필요함
 *
 *
 */
@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Board extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;
    @Column(length = 500, nullable = false)
    private String title;
    @Column(length = 2000, nullable = false)
    private String content;
    @Column(length = 50, nullable = false)
    private String writer;

    public void change(String title, String content){
        this.title = title;
        this.content = content;
    }
}
