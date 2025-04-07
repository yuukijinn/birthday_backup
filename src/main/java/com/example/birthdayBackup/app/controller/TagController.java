package com.example.birthdayBackup.app.controller;

import com.example.birthdayBackup.app.beanMapper.TagCreateFormToDomainMapper;
import com.example.birthdayBackup.app.form.TagCreateForm;
import com.example.birthdayBackup.domain.model.Tag;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

/**
 * タグコントローラー
 */
@Controller
@AllArgsConstructor
public class TagController {

    //依存クラス
    private final TagCreateFormToDomainMapper tagCreateFormToDomainMapper;

    /**
     * タグ作成処理
     *
     * @param tagCreateForm タグ登録用form
     */
    public void createTag(TagCreateForm tagCreateForm) {
        //タグ登録フォームをタグドメインモデルに変換
        Tag tag = tagCreateFormToDomainMapper.translate(tagCreateForm);
        //タグを登録

    }
}
