package com.lytefast.filedownloader;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;


/**
 * @author ${USER_NAME} on 6/12/17.
 */

public class DialogDownloadDetails extends AppCompatDialogFragment {

  private String fileUrl;
  private ProgressBar progressBar;
  private Button stopBtn;
  private Button cancelBtn;

  @Override
  public void onCreate(@Nullable final Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    fileUrl = getArguments().getString("fileUrl");
  }

  @Nullable
  @Override
  public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
    final View view = inflater.inflate(R.layout.dialog_download_details, container, false);
    progressBar = (ProgressBar) view.findViewById(R.id.progressBar);
    stopBtn = (Button) view.findViewById(R.id.stopBtn);
    cancelBtn = (Button) view.findViewById(R.id.cancelBtn);
    return view;
  }
}
