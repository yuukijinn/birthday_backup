package com.example.birthdayBackup.app.beanMapper;

import com.example.birthdayBackup.app.form.TagCreateForm;
import com.example.birthdayBackup.domain.model.Tag;
import org.mapstruct.Mapper;

/**
 * タグ作成用フォームをドメインモデルに変換するマッパー
 */
@Mapper(componentModel = "spring")
public interface TagCreateFormToDomainMapper {

    /**
     * タグ作成用フォームをドメインモデルに変換
     *
     * @param tagCreateForm タグ作成用フォーム
     * @return  ドメインモデル
     */
    Tag translate(TagCreateForm tagCreateForm);
}
