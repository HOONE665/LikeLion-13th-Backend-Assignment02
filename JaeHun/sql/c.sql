USE amusementpark;

ALTER TABLE rides
    ADD UNIQUE (name),     -- name은 중복이 안 되도록 고유값으로 설정
    MODIFY location VARCHAR(50) NOT NULL;  -- location 은 비어있을수 없으므로 NOT NULL 제약을 추가
