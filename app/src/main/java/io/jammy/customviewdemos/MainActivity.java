package io.jammy.customviewdemos;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.jammy.customviewdemos.Views.LinearLayoutWithTextBox;


public class MainActivity extends AppCompatActivity {

  @Bind(R.id.custom_view)
  LinearLayoutWithTextBox linearLayoutWithTextBox;

  @Override
  protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);

    // Initial value
    linearLayoutWithTextBox.setEmbeddedTextViewText("Blah!");
  }

  @OnClick(R.id.button_foo)
  public void foo() {

    linearLayoutWithTextBox.setEmbeddedTextViewText("FOO!");
  }

  @OnClick(R.id.button_bar)
  public void bar() {

    linearLayoutWithTextBox.setEmbeddedTextViewText("BAR!");
  }

  @OnClick(R.id.button_clear)
  public void clear() {

    linearLayoutWithTextBox.setEmbeddedTextViewText("");
  }
}
