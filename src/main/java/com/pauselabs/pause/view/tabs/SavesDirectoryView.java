package com.pauselabs.pause.view.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.joanzapata.android.iconify.IconDrawable;
import com.joanzapata.android.iconify.Iconify;
import com.pauselabs.R;

import butterknife.InjectView;
import butterknife.Views;

/**
 * Created by Passa on 1/27/15.
 */
public class SavesDirectoryView extends RelativeLayout {

    @InjectView(R.id.add_custom_btn)
    public Button addCustomBtn;
    @InjectView(R.id.custom_text)
    public EditText customText;
    @InjectView(R.id.savesDirectoryGrid)
    public ListView savesGrid;

    public SavesDirectoryView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SavesDirectoryView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public SavesDirectoryView(Context context) {
        super(context);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        Views.inject(this);

        Drawable pencilIcon = new IconDrawable(getContext(), Iconify.IconValue.fa_pencil).colorRes(R.color.text).actionBarSize();
        customText.setCompoundDrawables(pencilIcon, null, null, null);
        customText.setCompoundDrawablePadding(4);
    }

}