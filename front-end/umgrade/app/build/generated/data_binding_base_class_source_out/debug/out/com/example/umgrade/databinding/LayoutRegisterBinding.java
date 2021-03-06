// Generated by view binder compiler. Do not edit!
package com.example.umgrade.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
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

public final class LayoutRegisterBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final Button btnIdCheck;

  @NonNull
  public final Button btnJoin;

  @NonNull
  public final CheckBox ckAllCheck;

  @NonNull
  public final CheckBox ckMarketing;

  @NonNull
  public final CheckBox ckPersonal;

  @NonNull
  public final CheckBox ckTerms;

  @NonNull
  public final EditText edtJoinAddr;

  @NonNull
  public final EditText edtJoinEmail;

  @NonNull
  public final EditText edtJoinId;

  @NonNull
  public final EditText edtJoinName;

  @NonNull
  public final EditText edtJoinNick;

  @NonNull
  public final EditText edtJoinPhone;

  @NonNull
  public final EditText edtJoinPw;

  @NonNull
  public final EditText edtJoinPwCheck;

  @NonNull
  public final ImageView imgLogo;

  @NonNull
  public final TextView tvMoreOne;

  @NonNull
  public final TextView tvMoreTwo;

  private LayoutRegisterBinding(@NonNull CardView rootView, @NonNull Button btnIdCheck,
      @NonNull Button btnJoin, @NonNull CheckBox ckAllCheck, @NonNull CheckBox ckMarketing,
      @NonNull CheckBox ckPersonal, @NonNull CheckBox ckTerms, @NonNull EditText edtJoinAddr,
      @NonNull EditText edtJoinEmail, @NonNull EditText edtJoinId, @NonNull EditText edtJoinName,
      @NonNull EditText edtJoinNick, @NonNull EditText edtJoinPhone, @NonNull EditText edtJoinPw,
      @NonNull EditText edtJoinPwCheck, @NonNull ImageView imgLogo, @NonNull TextView tvMoreOne,
      @NonNull TextView tvMoreTwo) {
    this.rootView = rootView;
    this.btnIdCheck = btnIdCheck;
    this.btnJoin = btnJoin;
    this.ckAllCheck = ckAllCheck;
    this.ckMarketing = ckMarketing;
    this.ckPersonal = ckPersonal;
    this.ckTerms = ckTerms;
    this.edtJoinAddr = edtJoinAddr;
    this.edtJoinEmail = edtJoinEmail;
    this.edtJoinId = edtJoinId;
    this.edtJoinName = edtJoinName;
    this.edtJoinNick = edtJoinNick;
    this.edtJoinPhone = edtJoinPhone;
    this.edtJoinPw = edtJoinPw;
    this.edtJoinPwCheck = edtJoinPwCheck;
    this.imgLogo = imgLogo;
    this.tvMoreOne = tvMoreOne;
    this.tvMoreTwo = tvMoreTwo;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnIdCheck;
      Button btnIdCheck = ViewBindings.findChildViewById(rootView, id);
      if (btnIdCheck == null) {
        break missingId;
      }

      id = R.id.btnJoin;
      Button btnJoin = ViewBindings.findChildViewById(rootView, id);
      if (btnJoin == null) {
        break missingId;
      }

      id = R.id.ckAllCheck;
      CheckBox ckAllCheck = ViewBindings.findChildViewById(rootView, id);
      if (ckAllCheck == null) {
        break missingId;
      }

      id = R.id.ckMarketing;
      CheckBox ckMarketing = ViewBindings.findChildViewById(rootView, id);
      if (ckMarketing == null) {
        break missingId;
      }

      id = R.id.ckPersonal;
      CheckBox ckPersonal = ViewBindings.findChildViewById(rootView, id);
      if (ckPersonal == null) {
        break missingId;
      }

      id = R.id.ckTerms;
      CheckBox ckTerms = ViewBindings.findChildViewById(rootView, id);
      if (ckTerms == null) {
        break missingId;
      }

      id = R.id.edtJoinAddr;
      EditText edtJoinAddr = ViewBindings.findChildViewById(rootView, id);
      if (edtJoinAddr == null) {
        break missingId;
      }

      id = R.id.edtJoinEmail;
      EditText edtJoinEmail = ViewBindings.findChildViewById(rootView, id);
      if (edtJoinEmail == null) {
        break missingId;
      }

      id = R.id.edtJoinId;
      EditText edtJoinId = ViewBindings.findChildViewById(rootView, id);
      if (edtJoinId == null) {
        break missingId;
      }

      id = R.id.edtJoinName;
      EditText edtJoinName = ViewBindings.findChildViewById(rootView, id);
      if (edtJoinName == null) {
        break missingId;
      }

      id = R.id.edtJoinNick;
      EditText edtJoinNick = ViewBindings.findChildViewById(rootView, id);
      if (edtJoinNick == null) {
        break missingId;
      }

      id = R.id.edtJoinPhone;
      EditText edtJoinPhone = ViewBindings.findChildViewById(rootView, id);
      if (edtJoinPhone == null) {
        break missingId;
      }

      id = R.id.edtJoinPw;
      EditText edtJoinPw = ViewBindings.findChildViewById(rootView, id);
      if (edtJoinPw == null) {
        break missingId;
      }

      id = R.id.edtJoinPwCheck;
      EditText edtJoinPwCheck = ViewBindings.findChildViewById(rootView, id);
      if (edtJoinPwCheck == null) {
        break missingId;
      }

      id = R.id.imgLogo;
      ImageView imgLogo = ViewBindings.findChildViewById(rootView, id);
      if (imgLogo == null) {
        break missingId;
      }

      id = R.id.tvMoreOne;
      TextView tvMoreOne = ViewBindings.findChildViewById(rootView, id);
      if (tvMoreOne == null) {
        break missingId;
      }

      id = R.id.tvMoreTwo;
      TextView tvMoreTwo = ViewBindings.findChildViewById(rootView, id);
      if (tvMoreTwo == null) {
        break missingId;
      }

      return new LayoutRegisterBinding((CardView) rootView, btnIdCheck, btnJoin, ckAllCheck,
          ckMarketing, ckPersonal, ckTerms, edtJoinAddr, edtJoinEmail, edtJoinId, edtJoinName,
          edtJoinNick, edtJoinPhone, edtJoinPw, edtJoinPwCheck, imgLogo, tvMoreOne, tvMoreTwo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
