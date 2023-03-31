;Wait for 10 second to get upload popup
Local $winID = WinWait("[CLASS:#32770]","",10)

;set focus on file upload text field in upload window
ControlFocus($winID,"","Edit1")

;Set file name
ControlSetText($winID,"","Edit1","D:\Acceleration\UploadFiles\FileUpload.txt")

;Wait for 2 seconds
Sleep(2000)

;click on open Button
ControlClick($winID,"","Button1")
