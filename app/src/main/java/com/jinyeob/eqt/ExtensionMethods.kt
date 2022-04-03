package com.jinyeob.eqt

import android.annotation.SuppressLint
import android.util.Log
import android.widget.TextView
import androidx.databinding.BindingAdapter
import java.text.SimpleDateFormat
import java.util.Date

object ExtensionMethods {

    @SuppressLint("SimpleDateFormat")
    @BindingAdapter("app:bindDate")
    @JvmStatic
    fun TextView.bindDate(date: Date) {
        Log.d("tag", date.time.toString())
        this.text = SimpleDateFormat(MainActivity.DATE_FORMAT).format(date.time)
    }

    fun String.toShortBible(): String = when (this) {
        "창세기" -> "창"
        "출애굽기" -> "출"
        "레위기" -> "레"
        "민수기" -> "민"
        "신명기" -> "신"
        "여호수아" -> "수"
        "사사기" -> "삿"
        "룻기" -> "룻"
        "사무엘상" -> "삼상"
        "사무엘하" -> "삼하"
        "열왕기상" -> "왕상"
        "열왕기하" -> "왕하"
        "역대상" -> "대상"
        "역대하" -> "대하"
        "에스라" -> "스"
        "느헤미야" -> "느"
        "에스더" -> "에"
        "욥기" -> "욥"
        "시편" -> "시"
        "잠언" -> "잠"
        "전도서" -> "전"
        "아가" -> "아"
        "이사야" -> "사"
        "예레미야" -> "렘"
        "예레미야 애가" -> "애"
        "에스겔" -> "겔"
        "다니엘" -> "단"
        "호세아" -> "호"
        "요엘" -> "욜"
        "아모스" -> "암"
        "오바댜" -> "옵"
        "요나" -> "욘"
        "미가" -> "미"
        "나훔" -> "나"
        "하박국" -> "합"
        "스바냐" -> "습"
        "학개" -> "학"
        "스가랴" -> "슥"
        "말라기" -> "말"
        "마태복음" -> "마"
        "마가복음" -> "막"
        "누가복음" -> "눅"
        "요한복음" -> "요"
        "사도행전" -> "행"
        "로마서" -> "롬"
        "고린도전서" -> "고전"
        "고린도후서" -> "고후"
        "갈라디아서" -> "갈"
        "에베소서" -> "엡"
        "빌립보서" -> "빌"
        "골로새서" -> "골"
        "데살로니가전서" -> "살전"
        "데살로니가후서" -> "살후"
        "디모데전서" -> "딤전"
        "디모데후서" -> "딤후"
        "디도서" -> "딛"
        "빌레몬서" -> "몬"
        "히브리서" -> "히"
        "야고보서" -> "약"
        "베드로전서" -> "벧전"
        "베드로후서" -> "벧후"
        "요한일서" -> "요일"
        "요한이서" -> "요이"
        "요한삼서" -> "요삼"
        "유다서" -> "유"
        "요한계시록" -> "계"
        else -> ""
    }
}
