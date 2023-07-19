Public Class Form1

Dim currentZone As Integer

Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load
	currentZone = 1
End Sub

Private Sub setZone1_Click(sender As Object, e As EventArgs) Handles setZone1.Click
	currentZone = 1
	zone1Txt.Text = ("Currently in zone " & currentZone.ToString)
End Sub

Private Sub setZone2_Click(sender As Object, e As EventArgs) Handles setZone2.Click
	currentZone = 2
	zone2Txt.Text = ("Currently in zone " & currentZone.ToString)
End Sub

Private Sub btnEnterZone_Click(sender As Object, e As EventArgs) Handles btnEnterZone.Click
	If currentZone = 1 Then
		zone1Txt.Text = ("You are now In The Zone!")
	ElseIf currentZone = 2 Then
		zone2Txt.Text = ("You are now In The Zone!")
	Else
		MsgBox("Please select a zone")
	End If
End Sub

Private Sub btnExitZone_Click(sender As Object, e As EventArgs) Handles btnExitZone.Click
	If currentZone = 1 Then
		zone1Txt.Text = ("You are now Out Of The Zone!")
	ElseIf currentZone = 2 Then
		zone2Txt.Text = ("You are now Out Of The Zone!")
	Else
		MsgBox("Please select a zone")
	End If
End Sub

End Class