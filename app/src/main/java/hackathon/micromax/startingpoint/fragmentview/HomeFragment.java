package hackathon.micromax.startingpoint.fragmentview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import hackathon.micromax.R;
import hackathon.micromax.applauncher.AppLauncherActivity;
import hackathon.micromax.contacts.view.ContactActivity;
import hackathon.micromax.cpuprofiling.CpuProfilerActivity;
import hackathon.micromax.filemanager.FileManagerActivity;
import hackathon.micromax.requestrest.RequestRestActivity;
import hackathon.micromax.syncadapter.SyncConfigActivity;
import hackathon.micromax.sysimpanalysis.SysImpActivity;
import hackathon.micromax.uploadrest.UploadRestActivity;
import hackathon.micromax.usbchallenge.UsbActivity;
import hackathon.micromax.widget.WidgetConfigActivity;

/**
 * Created by apple on 01/07/15.
 */
public class HomeFragment extends Fragment implements View.OnClickListener{


    Button app_launcher_button;
    Button contacts_button;
    Button sync_adapter_button;
    Button widget_setting_button;
    Button cpu_frequency_analysis_button;
    Button system_impact_analysis_button;
    Button usb_driver_config_button;
    Button upload_file_button;
    Button request_file_button;
    Button file_manager_button;

    public HomeFragment(){
        android.util.Log.d("","");
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container,false);

        file_manager_button = (Button) rootView.findViewById(R.id.file_manager_button);
        app_launcher_button = (Button) rootView.findViewById(R.id.app_launcher_button);
        contacts_button= (Button) rootView.findViewById(R.id.contacts_button);
        sync_adapter_button= (Button) rootView.findViewById(R.id.sync_adapter_button);
        widget_setting_button= (Button) rootView.findViewById(R.id.widget_setting_button);
        cpu_frequency_analysis_button= (Button) rootView.findViewById(R.id.cpu_frequency_analysis_button);
        system_impact_analysis_button= (Button) rootView.findViewById(R.id.system_impact_analysis_button);
        usb_driver_config_button= (Button) rootView.findViewById(R.id.usb_driver_config_button);
        upload_file_button= (Button) rootView.findViewById(R.id.upload_file_button);
        request_file_button= (Button) rootView.findViewById(R.id.request_file_button);

        app_launcher_button.setOnClickListener(this);
        contacts_button.setOnClickListener(this);
        file_manager_button.setOnClickListener(this);
        sync_adapter_button.setOnClickListener(this);
        widget_setting_button.setOnClickListener(this);
        cpu_frequency_analysis_button.setOnClickListener(this);
        system_impact_analysis_button.setOnClickListener(this);
        usb_driver_config_button.setOnClickListener(this);
        upload_file_button.setOnClickListener(this);
        request_file_button.setOnClickListener(this);

        return rootView;
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.app_launcher_button:
                startActivity(new Intent(getActivity(), AppLauncherActivity.class));
                break;
            case R.id.contacts_button:
                startActivity(new Intent(getActivity(), ContactActivity.class));
                break;
            case R.id.sync_adapter_button:
                startActivity(new Intent(getActivity(), SyncConfigActivity.class));
                break;
            case R.id.widget_setting_button:
                startActivity(new Intent(getActivity(), WidgetConfigActivity.class));
                break;
            case R.id.cpu_frequency_analysis_button:
                startActivity(new Intent(getActivity(), CpuProfilerActivity.class));
                break;
            case R.id.system_impact_analysis_button:
                startActivity(new Intent(getActivity(), SysImpActivity.class));
                break;
            case R.id.usb_driver_config_button:
                startActivity(new Intent(getActivity(), UsbActivity.class));
                break;
            case R.id.upload_file_button:
                startActivity(new Intent(getActivity(), UploadRestActivity.class));
                break;
            case R.id.request_file_button:
                startActivity(new Intent(getActivity(), RequestRestActivity.class));
                break;
            case R.id.file_manager_button:
                startActivity(new Intent(getActivity(), FileManagerActivity.class));
                break;
            default:
                Toast.makeText(view.getContext(), "unknown", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
