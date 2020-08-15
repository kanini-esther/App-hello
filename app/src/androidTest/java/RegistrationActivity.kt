import com.google.gson.annotations.SerializedName

data class RegistrationResponse(
    @SerializedName("you have successfully registered") var message: String,
    @SerializedName("esther") var student: Student
)