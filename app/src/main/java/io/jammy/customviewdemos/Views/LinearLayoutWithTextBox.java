package io.jammy.customviewdemos.Views;


import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.jammy.customviewdemos.R;


/**
 * Created by Matt Fenlon on 09/11/15.
 */
public class LinearLayoutWithTextBox extends LinearLayout {

  @Bind(R.id.embedded_text_view)
  TextView embeddedTextView;

  public LinearLayoutWithTextBox(Context context) {

    super(context);

    init();
  }

  public LinearLayoutWithTextBox(Context context, AttributeSet attrs) {

    super(context, attrs);

    init();
  }

  private void init() {

    LayoutInflater.from(getContext()).inflate(R.layout.linear_layout_with_textview_layout, this);

    ButterKnife.bind(this);
  }

  public void setEmbeddedTextViewText(String text) {

    embeddedTextView.setText(text);

    if (text.equals("")) {
      embeddedTextView.setVisibility(GONE);
    }
    else {
      embeddedTextView.setVisibility(VISIBLE);
    }
  }
}
