#parse("Java File Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import android.os.Parcel;
import org.fs.mvvm.common.AbstractEntity;

public final class ${NAME} extends AbstractEntity {
  
  ${NAME}() { /*default constructor if you need to use it via reflection such as Gson uses.*/ }
  ${NAME}(Parcel input) {
    super(input);
  }
  
  @Override protected void readParcel(Parcel input) {
    //TODO read data
  }
  
  @Override public void writeToParcel(Parcel out, int flags) {
    //TODO write data
  }
  
  @Override public int describeContents() {
    return 0;
  }
  
  @Override protected String getClassTag() {
    return ${NAME}.class.getSimpleName();
  }

  @Override protected boolean isLogEnabled() {
    return BuildConfig.DEBUG;
  }
  
  public Builder newBuilder() {
    //TODO implement
    return null;
  }
  
  public final static Creator<${NAME}> CREATOR = new Creator<${NAME}>() {
      
    @Override public ${NAME} createFromParcel(Parcel input) {
      return new ${NAME}(input);
    }
    
    @Override public ${NAME}[] newArray(int size) {
      return new ${NAME}[size];
    }
  };
  
  public static class Builder {
    //attributes
    public Builder() { }
    public ${NAME} build() {
      //TODO implement
      return null;
    }
  }
}