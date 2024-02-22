from gtts import gTTS
import os

h = open('sample.txt')
text = h.read()

language = 'en'

obj = gTTS(text = text, lang = language, slow = False)

obj.save("sample.mp3")

os.system("sample.mp3")