// Generated by view binder compiler. Do not edit!
package com.example.umgrade.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.umgrade.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutLoginBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final Button btnKakaoLogin;

  @NonNull
  public final Button btnLogin;

  @NonNull
  public final EditText edtLoginId;

  @NonNull
  public final EditText edtLoginPw;

  @NonNull
  public final ImageView imgLogo;

  @NonNull
  public final TextView tvJoin;

  private LayoutLoginBinding(@NonNull CardView rootView, @NonNull Button btnKakaoLogin,
      @NonNull Button btnLogin, @NonNull EditText edtLoginId, @NonNull EditText edtLoginPw,
      @NonNull ImageView imgLogo, @NonNull TextView tvJoin) {
    this.rootView = rootView;
    this.btnKakaoLogin = btnKakaoLogin;
    this.btnLogin = btnLogin;
    this.edtLoginId = edtLoginId;
    this.edtLoginPw = edtLoginPw;
    this.imgLogo = imgLogo;
    this.tvJoin = tvJoin;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnKakaoLogin;
      Button btnKakaoLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnKakaoLogin == null) {
        break missingId;
      }

      id = R.id.btnLogin;
      Button btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.edtLoginId;
      EditText edtLoginId = ViewBindings.findChildViewById(rootView, id);
      if (edtLoginId == null) {
        break missingId;
      }

      id = R.id.edtLoginPw;
      EditText edtLoginPw = ViewBindings.findChildViewById(rootView, id);
      if (edtLoginPw == null) {
        break missingId;
      }

      id = R.id.imgLogo;
      ImageView imgLogo = ViewBindings.findChildViewById(rootView, id);
      if (imgLogo == null) {
        break missingId;
      }

      id = R.id.tvJoin;
      TextView tvJoin = ViewBindings.findChildViewById(rootView, id);
      if (tvJoin == null) {
        break missingId;
      }

      return new LayoutLoginBinding((CardView) rootView, btnKakaoLogin, btnLogin, edtLoginId,
          edtLoginPw, imgLogo, tvJoin);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
