package com.mddstudio.dictionary.feature_dictionary.domain.repository

import com.mddstudio.dictionary.core.util.Resource
import com.mddstudio.dictionary.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}