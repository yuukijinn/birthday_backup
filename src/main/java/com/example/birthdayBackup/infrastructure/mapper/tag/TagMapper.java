package com.example.birthdayBackup.infrastructure.mapper.tag;

import com.example.birthdayBackup.domain.model.Tag;
import org.apache.ibatis.annotations.Mapper;

/**
 * タグマッパーインターフェース
 */
@Mapper
public interface TagMapper {

    /**
     * タグを登録
     *
     * @param tag 登録するタグ情報
     */
    void insert(Tag tag);
}

