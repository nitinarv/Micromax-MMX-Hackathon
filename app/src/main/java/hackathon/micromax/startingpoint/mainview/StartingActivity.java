package hackathon.micromax.startingpoint.mainview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import hackathon.micromax.R;
import hackathon.micromax.startingpoint.fragmentview.FriendsFragment;
import hackathon.micromax.startingpoint.fragmentview.HomeFragment;
import hackathon.micromax.startingpoint.fragmentview.MessagesFragment;


public class StartingActivity extends AppCompatActivity implements FragmentDrawer.FragmentDrawerListener{

    private Toolbar mToolbar;
    private DrawerLayout mDrawerLayout;
    private FragmentDrawer mFragmentDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mDrawerLayout  =  (DrawerLayout) findViewById(R.id.drawer_layout);

        mFragmentDrawer = (FragmentDrawer) getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        mFragmentDrawer.setUp(R.id.fragment_navigation_drawer, mDrawerLayout, mToolbar);
        mFragmentDrawer.setDrawerListener(this);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        displayView(0);
    }

    private void displayView(int position){
        Fragment fragment = null;
        String title = getString(R.string.app_name);
        switch (position){
            case 0:
                fragment = new HomeFragment();
                title = getString(R.string.title_home);
                break;
            case 1:
                fragment = new FriendsFragment();
                title = getString(R.string.title_friends);
                break;
            case 2:
                fragment = new MessagesFragment();
                title = getString(R.string.title_messages);
                break;
            default:
                break;
        }

        if(fragment!=null){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_body,fragment);
            fragmentTransaction.commit();

            //set the toolbar title
            getSupportActionBar().setTitle(title);
        }
    }

    @Override
    public void onDrawerItemSelected(View view, int position) {
        displayView(position);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_starting, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch(item.getItemId()){
            case R.id.action_settings:
                return true;
            case android.R.id.home:
                if(mDrawerLayout!=null) {
                    if (!mDrawerLayout.isDrawerOpen(Gravity.LEFT)) {
                        mDrawerLayout.openDrawer(Gravity.LEFT);
                    } else {
                        mDrawerLayout.closeDrawer(Gravity.LEFT);
                    }
                }
                return true;
            case R.id.action_search:
                return true;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }


}
