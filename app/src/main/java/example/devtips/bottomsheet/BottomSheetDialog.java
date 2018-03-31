package example.devtips.bottomsheet;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by SUDA on 21-08-2017.
 */

public class BottomSheetDialog extends BottomSheetDialogFragment {

    @SuppressLint("RestrictedApi")
    @Override
    public void setupDialog(Dialog dialog, int style) {
        super.setupDialog(dialog, style);


        View contentView = View.inflate(getContext(), R.layout.model_bottom_sheet_layout, null);
        dialog.setContentView(contentView);

        ImageView imageView = (ImageView) contentView.findViewById(R.id.dummy_image);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "The Dialog ImageView is working fine...", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
