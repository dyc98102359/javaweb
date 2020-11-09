package com.shu.entity;

import lombok.*;

@NoArgsConstructor
@Data
@Getter
@Setter
@ToString
public class LoginUser {
        private int id;
        private String username;
        private String tele_num;
        private String isDel;
        private String role;
        private String password;
        private String salt;
}
