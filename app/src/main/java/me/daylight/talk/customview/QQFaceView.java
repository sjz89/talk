package me.daylight.talk.customview;

import android.content.Context;
import android.util.AttributeSet;

import com.qmuiteam.qmui.qqface.QMUIQQFaceCompiler;
import com.qmuiteam.qmui.qqface.QMUIQQFaceView;

import me.daylight.talk.utils.QQFaceManager;

public class QQFaceView extends QMUIQQFaceView {
    public QQFaceView(Context context) {
        super(context);
    }

    public QQFaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setCompiler(QMUIQQFaceCompiler.getInstance(QQFaceManager.getInstance()));
    }
}
