import module namespace mail = 'http://basex.org/modules/mail';

let $mail :=
  <mail>
    <!-- authentication -->
    <host>smtp.your-mail-provider.org</host>
    <ssl>true</ssl>
    <user>from@your-mail-provider.org</user>
    <password>.......</password>
    <!-- mail contents -->
    <from>from@your-mail-provider.org</from>
    <to>to@your-mail-recipient.org</to>
    <subject>Subject</subject>
    <message>Message</message>
  </mail>
return mail:send($mail)
