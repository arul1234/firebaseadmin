update xml files




<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="10dp"
    tools:context="myklguessing.com.kladmin.MainActivity">

    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

    <EditText
        android:id="@+id/head1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentTop="true"
        android:layout_marginTop="29dp"
        android:ems="10"
        android:hint="Heading"
        android:inputType="textPersonName" />

    <EditText
        android:id="@+id/content1"
        android:layout_width="match_parent"
        android:layout_below="@+id/head1"
        android:layout_centerHorizontal="true"
        android:ems="10"
        android:layout_height="200dp"
        android:inputType="text|textMultiLine"
        android:hint="Content1"
         />

    <EditText
        android:id="@+id/date"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignLeft="@+id/content1"
        android:layout_alignStart="@+id/content1"
        android:layout_below="@+id/content1"
        android:ems="10"
        android:hint="Date"
        android:inputType="textPersonName" />

    <EditText
        android:id="@+id/draw"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignLeft="@+id/date"
        android:layout_alignStart="@+id/date"
        android:layout_below="@+id/date"
        android:ems="10"
        android:hint="Draw"
        android:inputType="textPersonName" />

    <EditText
        android:id="@+id/a"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignLeft="@+id/draw"
        android:layout_alignStart="@+id/draw"
        android:layout_below="@+id/draw"
        android:ems="10"
        android:hint="A"
        android:inputType="textPersonName" />

    <EditText
        android:id="@+id/b"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignLeft="@+id/a"
        android:layout_alignStart="@+id/a"
        android:layout_below="@+id/a"
        android:ems="10"
        android:hint="B"
        android:inputType="textPersonName" />

    <EditText
        android:id="@+id/c"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@+id/b"
        android:layout_centerHorizontal="true"
        android:ems="10"
        android:hint="C"
        android:inputType="textPersonName" />

    <EditText
        android:id="@+id/three_digit"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignEnd="@+id/c"
        android:layout_alignRight="@+id/c"
        android:layout_below="@+id/c"
        android:layout_marginTop="12dp"
        android:ems="10"
        android:hint="3 Digit"
        android:inputType="textPersonName" />

    <EditText
        android:id="@+id/content2"
        android:layout_width="match_parent"
        android:layout_alignLeft="@+id/three_digit"
        android:layout_alignStart="@+id/three_digit"
        android:layout_below="@+id/three_digit"
        android:ems="10"
        android:layout_height="200dp"
        android:inputType="text|textMultiLine"
        android:hint="Content2" />

    <EditText
        android:id="@+id/content3"
        android:layout_width="match_parent"
        android:layout_alignLeft="@+id/content2"
        android:layout_alignStart="@+id/content2"
        android:layout_below="@+id/content2"
        android:ems="10"
        android:hint="Content3"
        android:layout_height="200dp"
        android:inputType="text|textMultiLine" />

    <Button
        android:id="@+id/btn"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:layout_below="@+id/content3"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="13dp"
        android:onClick="save"
        android:text="Save data" />

    </RelativeLayout>
    </ScrollView>

