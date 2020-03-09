package com.example.class07;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabpageAdapter extends FragmentPagerAdapter {
    public TabpageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch(position){

            case 0:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;
            case 1:
               GroupFragment groupFragment = new GroupFragment();
               return groupFragment;
            case 2:
                InboxFragment inboxFragment = new InboxFragment();
                return inboxFragment;
            case 3:
                TransactionFragment transactionFragment = new TransactionFragment();
                return transactionFragment;
            case 4:
                ContactFragment contactFragment = new ContactFragment();
                return contactFragment;
            case 5:
                NotificationsFragment notificationsFragment = new NotificationsFragment();
                return notificationsFragment;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
            case 0:
                return "Home";
            case 1:
                return "Group";
            case 2:
                return "Inbox";
            case 3:
                return "Trasaction";
            case 4:
                return "Contact";
            case 5:
                return "Notifications";
                default:
                    return null;
        }
    }
}
