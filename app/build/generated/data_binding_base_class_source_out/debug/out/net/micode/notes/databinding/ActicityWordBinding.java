// Generated by view binder compiler. Do not edit!
package net.micode.notes.databinding;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.viewbinding.ViewBinding;
import android.viewbinding.ViewBindings;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import net.micode.notes.R;
import net.micode.notes.ui.NoteEditText;

public final class ActicityWordBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView characterCount;

  @NonNull
  public final NoteEditText editText;

  private ActicityWordBinding(@NonNull RelativeLayout rootView, @NonNull TextView characterCount,
      @NonNull NoteEditText editText) {
    this.rootView = rootView;
    this.characterCount = characterCount;
    this.editText = editText;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActicityWordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActicityWordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.acticity_word, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActicityWordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.character_count;
      TextView characterCount = ViewBindings.findChildViewById(rootView, id);
      if (characterCount == null) {
        break missingId;
      }

      id = R.id.edit_text;
      NoteEditText editText = ViewBindings.findChildViewById(rootView, id);
      if (editText == null) {
        break missingId;
      }

      return new ActicityWordBinding((RelativeLayout) rootView, characterCount, editText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}