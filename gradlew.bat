<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/root_layout1"
    style="?background"
    android:layout_width="match_parent"
    android:layout_height="match_parent" >

    <RelativeLayout
        android:id="@+id/root_layout123"
        style="?background"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal" >

        <include
            android:id="@+id/cl23"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            layout="@layout/commonlayout" />

        <LinearLayout
            android:id="@+id/iconsLay13121"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_below="@+id/cl23"
            android:layout_marginLeft="8pt"
            android:layout_marginRight="8pt"
            android:layout_marginTop="8pt"
            android:baselineAligned="false"
            android:orientation="vertical" >

            <RelativeLayout
                android:id="@+id/headingText"
                android:layout_width="wrap_content"
                android:layout_height="0dp"
                android:layout_weight="1.5"
                android:baselineAligned="false"
                android:orientation="vertical" >

                <TableLayout
                    android:id="@+id/tablelayout"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content">
                    <!--<TableRow-->
                        <!--android:id="@+id/city_row"-->
                        <!--android:layout_height="wrap_content"-->
                        <!--android:layout_width="match_parent">-->
                        <!--<TextView-->
                            <!--android:id="@+id/city_label"-->
                            <!--android:layout_width="wrap_content"-->
                            <!--android:layout_height="wrap_content"-->
                            <!--android:text="@string/city"-->
                            <!--android:layout_column="1"/>-->
                        <!--<Spinner-->
      