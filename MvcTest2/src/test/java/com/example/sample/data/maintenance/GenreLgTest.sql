-- 大ジャンルデータ
INSERT INTO GENRE_LG VALUES('90', 'テストジャンル１', 66, NULL, '0', SYSTIMESTAMP, '9999', NULL, NULL);
INSERT INTO GENRE_LG VALUES('91', 'テストジャンル２', 77, NULL, '0', SYSTIMESTAMP, '9999', NULL, NULL);

-- 中ジャンルデータ
INSERT INTO GENRE_MD VALUES('9001', 'テスト中ジャンル１', 66, '90', NULL, '0', 9999999999, SYSTIMESTAMP, NULL, NULL);

-- ユーザー
INSERT INTO USER_INFO VALUES(1000000000, 'なし', '権限', 'user@test.co.jp', '0120111222', '9687fb3b98e1db5cda65c8011c14f3b0e6e96eb9e8fdd763a6b4c819ea8b944fa5f296bc45189087', '1', NULL, '0', SYSTIMESTAMP, 9999999999, NULL, NULL);
INSERT INTO USER_INFO VALUES(1000000001, 'あり', '権限', 'auth@test.co.jp', '0120222333', '9687fb3b98e1db5cda65c8011c14f3b0e6e96eb9e8fdd763a6b4c819ea8b944fa5f296bc45189087', '2', NULL, '0', SYSTIMESTAMP, 9999999999, NULL, NULL);