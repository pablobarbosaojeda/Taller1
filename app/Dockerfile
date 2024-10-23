FROM ubuntu:latest
# Install dependencies
RUN apt-get update && apt-get install -y \
    openjdk-11-jdk \
    wget \
    unzip \
    git \
    sqlite3  # Add this line to install SQLite CLI

# Download and configure Android SDK
RUN mkdir /android-sdk
RUN wget -q https://dl.google.com/android/repository/commandlinetools-linux-6858069_latest.zip -O /android-sdk/tools.zip
RUN unzip /android-sdk/tools.zip -d /android-sdk
RUN yes | /android-sdk/cmdline-tools/bin/sdkmanager --sdk_root=/android-sdk "platform-tools" "platforms;android-30" "build-tools;30.0.3"

# Configure environment variables
ENV ANDROID_HOME=/android-sdk
ENV PATH=$ANDROID_HOME/platform-tools:$PATH

# Create working directory
WORKDIR /workspace

# Default command
CMD ["tail", "-f", "/dev/null"]