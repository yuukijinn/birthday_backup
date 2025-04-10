package com.example.birthdayBackup.domain.checker.tag;

import com.example.birthdayBackup.domain.model.Tag;
import org.springframework.stereotype.Component;

/**
 * タグのチェッカークラス
 */
@Component
public class TagChecker {

    /**
     * タグ作成時における整合性チェック
     *
     * @param tag 登録するタグ情報
     */
    public void checkForCreate(Tag tag) {
        //タグの名称重複チェック
        checkTagDuplicate(tag);
    }

    /**
     * タグの名称重複チェック
     *
     * @param tag タグドメインモデル
     */
    private void checkTagDuplicate(Tag tag) {
        //渡されたタグ名称と同名の既存タグ件数を取得
        //いったん何もしない
    }
}
