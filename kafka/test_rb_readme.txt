1. yum install ruby -y
2. gem sources -a http://mirrors.aliyun.com/rubygems/
3. gpg --keyserver hkp://keys.gnupg.net --recv-keys 409B6B1796C275462A1703113804BB82D39DC0E3 7D2BAF1CF37B13E2069D6956105BD0E739499BDB
4. curl -sSL https://get.rvm.io | bash -s stable
5. source /etc/profile.d/rvm.sh
6. rvm -v
7. rvm install 2.5
8. ruby -v

測試ruby 連接kafka通不通
修改test.rb 中kafka的ip及port
執行
ruby test.rb
未報錯即是連線成功