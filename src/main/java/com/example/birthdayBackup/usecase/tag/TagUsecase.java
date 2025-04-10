package com.example.birthdayBackup.usecase.tag;

import com.example.birthdayBackup.domain.checker.tag.TagChecker;
import com.example.birthdayBackup.domain.model.Tag;
import com.example.birthdayBackup.domain.service.tag.TagService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * タグユースケース
 */
@Service
@AllArgsConstructor
public class TagUsecase {
    //依存クラス
    private final TagService tagService;
    private final TagChecker tagChecker;

    /**
     * タグ登録
     *
     * @param tag 登録するタグ情報
     */
   public void createTag(Tag tag) {
       //タグの重複チェック
       tagChecker.checkForCreate(tag);
       //タグを登録
       tagService.createTag(tag);
   }
}
