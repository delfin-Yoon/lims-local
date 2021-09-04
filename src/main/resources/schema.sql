DROP TABLE IF EXISTS user;

CREATE TABLE user (
  `user_id` 	varchar(100) NOT NULL COMMENT '로그인ID',
  `user_pwd` 	varchar(100) NOT NULL COMMENT '비밀번호',
  `user_name` 	varchar(100) NOT NULL COMMENT '이름',
  `email` 		varchar(100) NOT NULL COMMENT '이메일',
  `phone` 		varchar(100) NOT NULL COMMENT '연락처',
  PRIMARY KEY (`user_id`)
);